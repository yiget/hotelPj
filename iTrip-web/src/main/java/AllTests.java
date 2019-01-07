import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class AllTests {
	
	public static void main(String[] args) {
		List<Object> list=new ArrayList<Object>();
		
		for (int i = 0; i < 11; i++) {
			list.add(i);
		}
		PageHelper.startPage(0, 5);
		PageInfo<Object> page=new PageInfo<>(list);
		System.out.println(JSON.toJSONString(page));
	}
}
