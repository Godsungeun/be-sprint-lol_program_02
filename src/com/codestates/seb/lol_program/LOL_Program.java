package com.codestates.seb.lol_program;

public class LOL_Program {
  public static void main(String[] args) {
    //TODO:
    System.out.println("[안내] TRPG 스타크래프트 시작합니다.");
    System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");
    LoL_char user1 = new LoL_char();
    LoL_char user2 = new LoL_char();
    user1.user_create();
    user1.user_print(user1.user_create());
    System.out.println("\n[안내] 자신의 유닛 정보를 입력해 주세요.");

  }
}