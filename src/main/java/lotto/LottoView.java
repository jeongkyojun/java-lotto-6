package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.*;
public class LottoView {

    LottoController lottoController;

    private static final String STARTTEXT = "구입금액을 입력해 주세요.";
    private static final String SHOWTEXT = "개를 구매했습니다.";
    private static final String INPUTNUMBERTEXT = "당첨 번호를 입력해 주세요.";
    private static final String INPUTBONUSTEXT = "보너스 번호를 입력해 주세요.";

    LottoView(){
    }

    public void start(){
        System.out.println(STARTTEXT);
        String pMoney = Console.readLine();
        lottoController = new LottoController(Integer.parseInt(pMoney));
        System.out.println(lottoController.getMaxRound()+SHOWTEXT);
        //lottoController.startLotto();
        System.out.println(INPUTNUMBERTEXT);
        String numbers = Console.readLine();
        System.out.println(INPUTBONUSTEXT);
        String bonus = Console.readLine();
        lottoController.setLotto(getNumbers(numbers), Integer.parseInt(bonus));
    }

    private List<Integer> getNumbers(String numbers){
        List<Integer> result = new ArrayList<Integer>();
        StringTokenizer st = new StringTokenizer(numbers,",");
        while(st.hasMoreTokens()){
            result.add(Integer.parseInt(st.nextToken()));
        }
        return result;
    }
}
