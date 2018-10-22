package com.tong.lombok_access_modifier_warning.b;

import lombok.Data;

@Data
public class B {
    private Inner inner = new Inner();

    @Data
    public class Inner {
        private String msg = "some msg from B.Inner.class";
    }

}
