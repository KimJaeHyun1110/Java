import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class udpserver extends Thread{
  static int port = 26915;
  static int pin=5555;
  static DatagramSocket dsock = null;
  static String cli="";//클라이언트 앱 학생용
  static String mas="";//마스터 앱 교수용
  static void send(InetAddress ip, String text) {
	  send(ip,text,port);
  }
  static void send(InetAddress ip, String text, int sport) {
    try {
    	//System.out.println(ip.getHostAddress());
      byte[] buffer = text.getBytes();
      DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
      dp = new DatagramPacket(dp.getData(), dp.getData().length, ip, port);
      dsock.send(dp);
      System.out.println("전송완료 데이터:"+new String(dp.getData())+",대상ip:"+dp.getAddress().getHostAddress());
    } catch (Exception e) {
      System.out.println(e);
    } 
  }


  public void run(){
	  Scanner sc=new Scanner(System.in);
	  String tip="";
	  String tdata="";
	  int tport=0;
	  while (true) {
		tip=sc.nextLine();
		if(tip.equals("send")) {
			System.out.println("보낼IP");
		  	tip=sc.nextLine();
			System.out.println("보낼PORT");
		  	tport=sc.nextInt();
		  	sc.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
			System.out.println("보낼 데이터");
		  	tdata=sc.nextLine();
		  	try{send(InetAddress.getByName(tip), tdata, tport);
		  	System.out.println("보냄");}catch(UnknownHostException e){e.printStackTrace();}
	    }else if(tip.equals("exit")) {
	    	System.exit(0);
	    }
	  }
  }/*
  public void run() {
	  try {
		//DatagramSocket ds=new DatagramSocket(7777);
		//ds.setBroadcast(true);
		  MulticastSocket ms = new MulticastSocket(25001);
		    
		    // 데이터를 읽어 올 multicast 주소
		    InetAddress ia = InetAddress.getByName("224.23.95.10");
		    SocketAddress socketAddress = new InetSocketAddress(ia, 25001);
		    NetworkInterface networkInterface = NetworkInterface.getByName("224.23.95.10");

		    ms.joinGroup(socketAddress, networkInterface);
		    //ms.setBroadcast(true);
		    // 그룹에 가입 -> 데이터 수신은 Unicast Datagram과 동일
		    //ms.joinGroup(ia);
		    System.out.println("그룹전송 대기중");
    	while (true) {
	        byte[] buffer = new byte[1024];
	        DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
		    //ds.receive(receivePacket);
	        ms.receive(receivePacket);
		    String msg = new String(receivePacket.getData(), 0, receivePacket.getLength());
	        System.out.println("그룹전송 받은 문자열 :" + msg);
	        System.out.println(receivePacket.getAddress());
		    if (msg.equals("[cliconnect]")) {
	        	cli=receivePacket.getAddress().getHostAddress();
	            send(receivePacket.getAddress(), "[enable]");
	          }
	        if (msg.equals("[masconnect]")) {
	        	mas=receivePacket.getAddress().getHostAddress();
	            send(receivePacket.getAddress(), "[scon]");
	          }
    	}    
	  }catch (Exception e) {
		  e.printStackTrace();
	  }
  }*/
  public static void main(String[] args) {
    try {
      Scanner sc=new Scanner(System.in);
      System.out.println("접속 대기상태입니다.\n포트를 지정해 주세요(0-65535 기본26915): ");
      port=Integer.parseInt(sc.nextLine());
      port=(port==0?26915:port);//26915는 설정을 안했을때 자동으로 되는 기본포트값 
      System.out.println("\n설정 포트는 "+port+"입니다.\n대기중...");
      System.out.println("내IP:"+InetAddress.getLocalHost().getHostAddress());
      dsock = new DatagramSocket(port);
      new udpserver().start();
      while (true) {
        byte[] buffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
        dsock.receive(receivePacket);
        String msg = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("전송 받은 문자열 : " + msg);
        System.out.println(receivePacket.getAddress());
        
        if (msg.equals("[cliconnect]")) {
        	cli=receivePacket.getAddress().getHostAddress();
            send(receivePacket.getAddress(), "[enable]");
        }else if (msg.equals("[masconnect]")) {
        	mas=receivePacket.getAddress().getHostAddress();
            send(receivePacket.getAddress(), "[scon]");
        }else if(msg.startsWith("[app]")) {
            int idnum=0,inpin=0;
        	idnum=Integer.parseInt(msg.substring(5, 14));
        	inpin=Integer.parseInt(msg.substring(14));
        	if(inpin==pin) {
        		System.out.println("학번:"+idnum+" 출석완료");
        		send(receivePacket.getAddress(), "[succe]");
        	}else {
        		System.out.println("학번:"+idnum+" 출석인증실패");
        		send(receivePacket.getAddress(), "[piner]");
        	}
        }else if(msg.startsWith("[logindata]")) {
        	if(msg.substring(11, (msg.indexOf("?"))).equals("202395010")&&msg.substring((msg.indexOf("?")+1)).equals("7777")) {
        		System.out.println("학번:"+msg.substring(11, (msg.indexOf("?")))+" 접속완료");
        		send(receivePacket.getAddress(), "[login]");
        	}else{
        		System.out.println("학번:"+msg.substring(11, (msg.indexOf("?")))+" 접속실패");
        		send(receivePacket.getAddress(), "[loerr]");
        	}
        }
      }
    }
    catch (Exception e) {e.printStackTrace();
    } finally {
      if (dsock != null)
        dsock.close(); 
    } 
  }
}
