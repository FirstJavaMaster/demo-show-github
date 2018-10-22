package com.tong.lombok_access_modifier_warning.a;

public class A {
    private Inner inner = new Inner();

    public class Inner {
        private String msg = "some msg from A.Inner.class";

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    public Inner getInner() {
        return inner;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }
}
