package kr.heesu.lotto.view;

public enum ViewMessage {
    INPUT_FOR_PURCHASE_AMOUNT("\n구입금액을 입력해 주세요."),
    INPUT_FOR_MANUAL_AMOUNT("\n수동으로 구매할 로또 수를 입력해 주세요."),
    INPUT_FOR_WINNING_NUMBERS("\n지난 주 당첨 번호를 입력해 주세요"),
    INPUT_FOR_BONUS_NUMBER("보너스 볼을 입력해 주세요."),
    INPUT_FOR_MANUAL_LOTTO("\n수동으로 구매할 번호를 입력해 주세요"),
    OUTPUT_FORMAT_FOR_SECOND_RANK("%d개 일치, 보너스 볼 일치 (%d) - %d개"),
    OUTPUT_FOR_LOTTO_STATISTICS("\n당첨 통계"),
    OUTPUT_FOR_LINE("---------------------------"),
    OUTPUT_FORMAT_FOR_PURCHASE_SIZE("\n수동으로 %d장, 자동으로 %d개를 구매했습니다."),
    OUTPUT_FORMAT_FOR_MATCH_RESULT("%d개 일치 (%d원) - %d개"),
    OUTPUT_FORMAT_FOR_PROFIT_RATE("총 수익률은 %.2f 입니다."),
    OUTPUT_FOR_PROFIT_RATE_LOSS(" (기준이 1이기 때문에 결과적으로 손해라는 의미임)"),
    OUTPUT_FOR_PROFIT_RATE_BENEFIT(" (기준이 1이기 때문에 결과적으로 이득이라는 의미임)");

    private final String message;

    ViewMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
