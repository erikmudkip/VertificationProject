package cm;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PranantaErikTestTask2 {
	
	@Test
    public void testCase1001() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test
    public void testCase1002() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal(Double.MAX_VALUE);
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test
    public void testCase1003() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("0.00");
		BigDecimal reducedRate= new BigDecimal("0.00");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1004() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("0.00");
		BigDecimal reducedRate= new BigDecimal("30.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1005() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("1.21");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1006() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("-53.59");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test
	public void testCase1007() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal(Double.MAX_VALUE);
		BigDecimal reducedRate= new BigDecimal(Double.MAX_VALUE);
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test
    public void testCase1008() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("10.54");
		BigDecimal reducedRate= new BigDecimal("0.00");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1009() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("10.54");
		BigDecimal reducedRate= new BigDecimal("-23.44");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test
    public void testCase1010() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test
    public void testCase1011() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();

		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1012() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 3;
		int endHour1 = 8;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 4;
		int endHour2 = 7;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1013() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 11;
		int endHour1 = 20;
		Period period1 = new Period(startHour1, endHour1);
		
		normalPeriods.add(period1);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1014() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 18;
		int endHour2 = 30;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 13;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test
    public void testCase1015() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 10;
		int endHour1 = 14;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 18;
		int endHour2 = 21;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1016() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 11;
		int endHour4 = 13;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1017() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 50;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1018() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = null;
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1019() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= null;
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1020() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = null;
		BigDecimal reducedRate= null;
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1021() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = null;
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1022() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = null;
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1023() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = null;
		ArrayList<Period> reducedPeriods = null;

		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
	
	@Test
    public void testCase2001() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
		
		int startHour = 9;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = rateTest.calculate(periodStay);
        assertEquals(payment, new BigDecimal("29.67"));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase2002() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
		
		int startHour = 35;
		int endHour = 40;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = rateTest.calculate(periodStay);
    }
	
	@Test
    public void testCase2003() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
		
		int startHour = 0;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = rateTest.calculate(periodStay);
        assertEquals(payment, new BigDecimal("46.02"));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase2004() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
		
		int startHour = 9;
		int endHour = 40;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = rateTest.calculate(periodStay);
    }
	
	@Test(expected = IllegalArgumentException.class)
	public void testCase2005() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
		
		int startHour = -19;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = rateTest.calculate(periodStay);
    }
	
	@Test
    public void testCase2006() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("0.00");
		BigDecimal reducedRate= new BigDecimal("0.00");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
		
		int startHour = 9;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = rateTest.calculate(periodStay);
        assertEquals(payment, new BigDecimal("0.00"));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase2007() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal(Double.MAX_VALUE);
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
		
		int startHour = -19;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = rateTest.calculate(periodStay);
    }
	
	@Test
    public void testCase2008() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal(Double.MAX_VALUE);
		BigDecimal reducedRate= new BigDecimal(Double.MAX_VALUE);
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
		
		int startHour = -19;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = rateTest.calculate(periodStay);
    }
	
	@Test
    public void testCase2009() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
		
		int startHour = 9;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = rateTest.calculate(periodStay);
        assertEquals(payment, new BigDecimal("0.00"));
	}
	
	@Test
    public void testCase2010() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();

		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
		
		int startHour = 9;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = rateTest.calculate(periodStay);
        assertEquals(payment, new BigDecimal("13.32"));
	}
	
	@Test
    public void testCase2011() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);

		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
		
		int startHour = 9;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = rateTest.calculate(periodStay);
        assertEquals(payment, new BigDecimal("16.35"));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase2012() {
		CarParkKind kind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		
		int startHour1 = 6;
		int endHour1 = 10;
		Period period1 = new Period(startHour1, endHour1);
		
		int startHour2 = 14;
		int endHour2 = 18;
		Period period2 = new Period(startHour2, endHour2);
		
		normalPeriods.add(period1);
		normalPeriods.add(period2);
		
		int startHour3 = 10;
		int endHour3 = 14;
		Period period3 = new Period(startHour3, endHour3);
		
		int startHour4 = 18;
		int endHour4 = 21;
		Period period4 = new Period(startHour4, endHour4);
		
		reducedPeriods.add(period3);
		reducedPeriods.add(period4);
		
		Rate rateTest = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
		
		int startHour = 15;
		int endHour = 3;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = rateTest.calculate(periodStay);
    }
	
	@Test
	public void testCase3001() {
		int startHour = 5;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        int durationStay = periodStay.duration();
        assertEquals(durationStay, 10);
    }

	@Test
	public void testCase4001() {
		CarParkStatus status = CarParkStatus.FULL;
    }
}
