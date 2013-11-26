package Avro.AvroTestMaven;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.Server;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.apache.avro.ipc.specific.SpecificResponder;
import org.apache.avro.util.Utf8;



public class ClientApp {

    public static void main(String[] args) throws IOException, InterruptedException {


        NettyTransceiver client = new NettyTransceiver(new InetSocketAddress(65111));
        
        BLOBTransfer proxy = (BLOBTransfer) SpecificRequestor.getClient(BLOBTransfer.class, client);
        
        AndersBlob andersBlob= new AndersBlob();
        
        andersBlob.setId(1);
        andersBlob.setName("TestBlob");
        andersBlob.setBytes(new ArrayList<ByteBuffer>());
        
        System.out.println("Sender: " + andersBlob.toString());
        
        
        for(int i = 0; i < 100; i++) {
        	System.out.println("Result: " + proxy.send(andersBlob));
        	Thread.sleep(1000);
        }
        	
        
        // cleanup
        client.close();
    }
}
