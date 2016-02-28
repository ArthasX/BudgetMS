package com.budgetms.pojo;
/**
 * 所有属性都设置成string  
 * 为了在转json的时候方便处理  '' 和 null
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BasePOJO {
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Method[] m = this.getClass().getMethods();
		for (int i = 0; i < m.length; i++) {
			if (m[i].getName().startsWith("get")
					&& !m[i].getName().equals("getClass"))
				try {
					sb.append(m[i].getName() + ": "
							+ m[i].invoke(this, new Object[] {}) + "\n");
				} catch (IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		return sb.toString();

	}
}
