/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.mockito.Mockito.*;  
  
import java.util.List;  
  
import org.junit.Assert;  
import org.junit.Test;  
  

/**
 *
 * @author MikeyJou
 */

public class MockitoTest {  
          
    @Test  
    public void simpleTest(){  
          
        //创建mock对象，参数可以是类，也可以是接口  
        List<String> list = mock(List.class);  
          
        //设置方法的预期返回值  
        when(list.get(0)).thenReturn("helloworld");  
      
        String result = list.get(0);  
          
        //验证方法调用(是否调用了get(0))  
        verify(list).get(0);  
          
        //junit测试  
        Assert.assertEquals("helloworld1", result);  
    }
}  