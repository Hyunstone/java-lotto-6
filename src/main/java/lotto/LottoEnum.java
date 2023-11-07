package lotto;

import java.util.HashMap;
import java.util.Map;

public enum LottoEnum {
    FIFTH(5,"3개 일치", "(5,000원)", 5000),
    FOURTH(4,"4개 일치", "(50,000원)", 50000),
    THIRD(3,"5개 일치", "(1,500,000원)", 1500000),
    SECOND(2,"5개 일치, 보너스 볼 일치", "(30,000,000원)", 30000000),
    FIRST(1,"6개 일치", "(2,000,000,000원)", 2000000000);

    private final int rank;
    private final String matching;
    private final String prizeRefer;
    private final int prizeMoney;

    LottoEnum(int rank, String matching, String prizeRefer, int prizeMoney) {
        this.rank = rank;
        this.matching = matching;
        this.prizeRefer = prizeRefer;
        this.prizeMoney = prizeMoney;
    }

    public static LottoEnum getRankByMatchCount(final int matchCount) {}

    public String getMatching() {
        return matching;
    }
    public String getPrizeRefer() {
        return prizeRefer;
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }

    public String getWinInformation() {
        return getMatching() + " " + getPrizeRefer();
    }
}
