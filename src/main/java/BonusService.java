public class BonusService {
    public long calculate(long amount, boolean registered) {
        int limit = 500;
        int percent = registered ?  3 : 1;
        long bonus = amount * percent / 100 / 100;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
