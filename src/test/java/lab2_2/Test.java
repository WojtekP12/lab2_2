package lab2_2;

import static org.junit.Assert.*;

import org.junit.Assert;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class Test {

	//ID TESTS
		@org.junit.Test
		public void IdEqualsTest() 
		{
			Id id1 = new Id("1");
			Id id2 = new Id("2");
			Assert.assertEquals(false, id1.equals(id2));
			
			Id id3 = id2;
			Assert.assertEquals(true, id3.equals(id2));
			
			Id id4 = null;
			Assert.assertEquals(false,id3.equals(id4));
			
			ClientData d = new ClientData(id1,"a");
			Assert.assertEquals(false, id3.equals(d));
			
			Id id5 = new Id("1");
			Assert.assertEquals(true, id5.equals(id1));
		}
}
