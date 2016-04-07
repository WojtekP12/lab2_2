package lab2_2;

import static org.junit.Assert.*;

import org.junit.Assert;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

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
		
		//MONEY TESTS
		@org.junit.Test
		public void MultiMoneyTest() 
		{
			Money m1 = new Money(5);
			Money m2 = new Money(10);
			Assert.assertEquals(true, m1.multiplyBy(2).lessOrEquals(m2));
		}
		
		@org.junit.Test
		public void AddMoneyTest() 
		{
			Money m1 = new Money(5);
			Money m2 = new Money(10);
			Money m3 = new Money(15);
			Assert.assertEquals(true, m1.add(m2).lessOrEquals(m3));
		}
}
