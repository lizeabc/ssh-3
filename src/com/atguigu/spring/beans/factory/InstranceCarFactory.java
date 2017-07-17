package com.atguigu.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

//实例工厂方法：先实例工厂本身，再调用工厂的实例方法来返回bean的实例
public class InstranceCarFactory {

	private Map<String, Car>cars=null;
	
	public InstranceCarFactory() {
		cars=new HashMap<String, Car>();
		cars.put("audi", new Car("audi", 200000));
		cars.put("ford", new Car("ford", 200000));	
	}
	public Car getCar(String brand){
		return cars.get(brand);
	}
}
