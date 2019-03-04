import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import models.CarParkKind;
import models.Period;
import models.Rate;

public class PranantaErikTestTask1 {

	@Test
    public void testCase1001() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        assertEqual(rateTest.normalRate(), new BigDecimal("5.45"));
    }
	
	@Test
    public void testCase1002() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal(Double.MAX_VALUE);
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        assertEqual(rateTest.normalRate(), new BigDecimal(Double.MAX_VALUE));
    }
	
	@Test
    public void testCase1003() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("0.00");
		BigDecimal reducedRate= new BigDecimal("0.00");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        assertEqual(rateTest.normalRate(), new BigDecimal("0.00"));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1004() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("0.00");
		BigDecimal reducedRate= new BigDecimal("30.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1005() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("1.21");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1006() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("-53.59");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
	
	@Test
	public void testCase1007() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal(Double.MAX_VALUE);
		BigDecimal reducedRate= new BigDecimal(Double.MAX_VALUE);
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		assertEqual(rateTest.reducedRate(), new BigDecimal(Double.MAX_VALUE));
    }
	
	@Test
    public void testCase1008() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("10.54");
		BigDecimal reducedRate= new BigDecimal("0.00");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		assertEqual(rateTest.reducedRate(), new BigDecimal("0.00"));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1009() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("10.54");
		BigDecimal reducedRate= new BigDecimal("-23.44");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
	
	@Test
    public void testCase1010() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
        assertEqual(rateTest.normalPeriods(), new ArrayList<Period>());
    }
	
	@Test
    public void testCase1011() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		assertEqual(rateTest.normalPeriods(), new ArrayList<Period>());
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1012() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((3,8),(4,7)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1013() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((11,20)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1014() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(18,30)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(13,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
	
	@Test
    public void testCase1015() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		assertEqual(rateTest.reducedPeriods(), new ArrayList<Period>());
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1016() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(11,13)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase1017() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,50)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
	
	@Test
    public void testCase2001() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		
		int startHour = 9;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = new BigDecimal(rateTest.calculate(periodStay));
        assertEqual(payment, new BigDecimal("29.67"));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase2002() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		
		int startHour = 35;
		int endHour = 40;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = new BigDecimal(rateTest.calculate(periodStay));
    }
	
	@Test
    public void testCase2003() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		
		int startHour = 0;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = new BigDecimal(rateTest.calculate(periodStay));
        assertEqual(payment, new BigDecimal("46.02"));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase2004() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		
		int startHour = 9;
		int endHour = 40;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = new BigDecimal(rateTest.calculate(periodStay));
    }
	
	@Test(expected = IllegalArgumentException.class)
	public void testCase2004() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		
		int startHour = -19;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = new BigDecimal(rateTest.calculate(periodStay));
    }
	
	@Test
    public void testCase2006() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("0.00");
		BigDecimal reducedRate= new BigDecimal("0.00");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		
		int startHour = 9;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = new BigDecimal(rateTest.calculate(periodStay));
        assertEqual(payment, new BigDecimal("0.00"));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase2007() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal(Double.MAX_VALUE);
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		
		int startHour = -19;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = new BigDecimal(rateTest.calculate(periodStay));
    }
	
	@Test
    public void testCase2008() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal(Double.MAX_VALUE);
		BigDecimal reducedRate= new BigDecimal(Double.MAX_VALUE);
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		
		int startHour = -19;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = new BigDecimal(rateTest.calculate(periodStay));
    }
	
	@Test
    public void testCase2009() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		
		int startHour = 9;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = new BigDecimal(rateTest.calculate(periodStay));
        assertEqual(payment, new BigDecimal("0.00"));
	}
	
	@Test
    public void testCase2010() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		
		int startHour = 9;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = new BigDecimal(rateTest.calculate(periodStay));
        assertEqual(payment, new BigDecimal("13.32"));
	}
	
	@Test
    public void testCase2011() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>();
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		
		int startHour = 9;
		int endHour = 15;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = new BigDecimal(rateTest.calculate(periodStay));
        assertEqual(payment, new BigDecimal("16.35"));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testCase2012() {
		CarParkKind kind = new CarParkKind("Car Park Test");
		BigDecimal normalRate = new BigDecimal("5.45");
		BigDecimal reducedRate= new BigDecimal("3.33");
		ArrayList<Period> normalPeriods = new ArrayList<Period>(Arrays.asList((6,10),(14,18)));
		ArrayList<Period> reducedPeriods = new ArrayList<Period>(Arrays.asList((10,14),(18,21)));
		Rate rateTest = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
		
		int startHour = 15;
		int endHour = 3;
        Period periodStay = new Period(startHour, endHour);
        BigDecimal payment = new BigDecimal(rateTest.calculate(periodStay));
    }

}
