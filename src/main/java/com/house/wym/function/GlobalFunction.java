    package com.house.wym.function;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GlobalFunction {
    public static void main(String[] args) throws Exception {
        // 创建 ObjectMapper 对象
        ObjectMapper objectMapper = new ObjectMapper();

        // 将 Java 对象转换为 JSON 字符串
        MyObject myObject = new MyObject("dnmd", 123);
        String json = objectMapper.writeValueAsString(myObject);
        System.out.println(json);

        // 将 JSON 字符串转换为 Java 对象
        String jsonInput = "{\"name\":\"dnmd\",\"age\":123}";
        MyObject myObject2 = objectMapper.readValue(jsonInput, MyObject.class);
        System.out.println(myObject2.getName());
        System.out.println(myObject2.getAge());

    }
}
class MyObject {
    private String name;
    private int age;

    // 必须提供默认构造 函数
    public MyObject() {
    }

    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter 和 setter 方法
    // ...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
