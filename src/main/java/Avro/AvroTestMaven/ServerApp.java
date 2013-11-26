package Avro.AvroTestMaven;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.Server;
import org.apache.avro.ipc.specific.SpecificResponder;
import org.apache.avro.util.Utf8;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.execution.ExecutionHandler;
import org.jboss.netty.handler.execution.OrderedMemoryAwareThreadPoolExecutor;



public class ServerApp {
	public static class BLOBTransferImpl implements BLOBTransfer {

		public Utf8 send(AndersBlob andersBlob) {
				return new Utf8("Mottar melding med id: " + andersBlob.getId()) ;
		}
		
	}
	
    private static Server server;

    private static void startServer() throws IOException {
        server = new NettyServer(new SpecificResponder(BLOBTransfer.class, new BLOBTransferImpl()), new InetSocketAddress(65111));
        
        /*ExecutorService es = Executors.newCachedThreadPool();
        
        OrderedMemoryAwareThreadPoolExecutor executor = new OrderedMemoryAwareThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), 0, 0);
       
        ExecutionHandler executionHandler = new ExecutionHandler(executor);
        
        server = new NettyServer(
        		new SpecificResponder(BLOBTransfer.class, new BLOBTransferImpl()), 
        		new InetSocketAddress(65111), 
        		new NioServerSocketChannelFactory(es, es), executionHandler);*/
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Starting server");
        // usually this would be another app, but for simplicity
        startServer();
        
        System.out.println("Server started");

        server.close();
        System.out.println("Stopped");
    }
}
