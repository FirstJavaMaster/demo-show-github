package com.tong.lombok_access_modifier_warning;

import com.tong.lombok_access_modifier_warning.a.A;
import com.tong.lombok_access_modifier_warning.b.B;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(new A().getInner().getMsg());

        System.out.println(new B().getInner().getMsg());
    }
}
