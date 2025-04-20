package RPGame;

import java.util.Scanner;

public class RPGmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserStatus user = new UserStatus();
        Monster[] Monsters = new Monster[4];
        Monster monster = new Monster();

        System.out.println("RPG를 시작하시겠습니까? Yes : No");
        String start = scanner.nextLine();
        if(start.toUpperCase().equals("YES")){
            System.out.println("게임을 시작합니다.");
            System.out.println("사용자의 정보를 입력해주세요");

            //User정보 입력
            user.userName = scanner.nextLine();
            System.out.println("사용자의 공격력을 입력해주세요.");
            user.attack = scanner.nextDouble();
            System.out.println("사용자의 방어력을 입력해주세요");
            user.defensive = scanner.nextDouble();
            System.out.println("사용자의 체력을 입력해주세요");
            user.hp = scanner.nextDouble();
            user.money = 100;

            System.out.println("사용자의 정보");
            System.out.println("사용자의 이름 : " + user.userName);
            System.out.println("사용자의 체력 : " + user.hp);
            System.out.println("사용자의 공격력 : " + user.attack);
            System.out.println("사용자의 방어력 : " + user.defensive);
            System.out.println("사용자의 돈 : " + user.money);

            for (int i = 0; i < Monsters.length; i++) {
                try {
                    monster = new Monster();
                    System.out.println((i + 1) + "번째 몬스터의 이름을 입력하세요.");
                    scanner.nextLine();
                    monster.MonsterName = scanner.nextLine();
                    System.out.println("몬스터의 HP를 입력하세요.");
                    monster.hp = Integer.parseInt(scanner.nextLine());
                    System.out.println("몬스터의 보상을 입력하세요.");
                    monster.reward = Integer.parseInt(scanner.nextLine());
                    Monsters[i] = monster;
                } catch (NumberFormatException e) {
                    System.out.println("숫자를 정확히 입력하세요!");
                    i--;  // 다시 입력 기회 제공
                }
            }

            int chk = 0;
            do{
                System.out.println("잡을 몬스터를 선택하세요");
                for (int i = 0; i < Monsters.length + 1; i++) {
                    try {
                        System.out.print((i+1) + Monsters[i].MonsterName + "\t");
                    } catch (Exception e) {
                        System.out.print((i+1) + ". 종료하기");
                    }
                }

                int selectMonser = Integer.parseInt(scanner.next());

                for (int i = 0; i < Monsters.length + 1; i++) {
                    if(selectMonser == i && selectMonser != 5){

                    }else chk = 1; break;
                }

            }while (chk == 0);
            

        }
        else{
            System.out.println("종료되었습니다.");
        }
    }
}
