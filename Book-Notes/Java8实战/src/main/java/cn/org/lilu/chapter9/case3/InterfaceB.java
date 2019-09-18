package cn.org.lilu.chapter9.case3;

import cn.org.lilu.chapter9.case1.InterfaceA;

/**
 * @Auther: Java成魔之路
 * @Date: 2019/8/23
 * @Description: 接口B 继承 接口A，提供自己的默认hello方法
 */
public interface InterfaceB extends InterfaceA {
    default void hello() {
        System.out.println("hello interface B");
    }
}
