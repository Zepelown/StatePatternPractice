package org.example.view;

import org.example.model.Code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoorLockInput {
    public Code getDoorLockCode(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("비밀번호를 입력하세요:");
            try {
                String input = bufferedReader.readLine();
                return new Code(input);
            } catch (IOException | IllegalArgumentException e) {
                System.out.println("입력 오류가 발생했습니다. 다시 시도해주세요.");
            }
        }
    }
    public Boolean getCloseDoorInput() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("문을 닫을 시엔 '닫음'을 입력해주세요.");
            try {
                String input = bufferedReader.readLine();
                return true;
            } catch (IOException | IllegalArgumentException e) {
                System.out.println("입력 오류가 발생했습니다. 다시 시도해주세요.");
            }
        }
    }
}
