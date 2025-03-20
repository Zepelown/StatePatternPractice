package org.example.model;

public class Code {
    private static final int MAX_LENGTH = 4;
    private final String code;

    public Code(String code) {
        if(!validate(code)) {
            throw new IllegalArgumentException("잘못된 비밀번호 입력값입니다.");
        }
        this.code = code;

    }

    public boolean isMatched(Code code){
        return this.code.equals(code.code);
    }

    private boolean validate(String code){
        return code.length()<= MAX_LENGTH && !code.isEmpty();
    }
}
