
public class WhereIsVasya {

    public static int whereIsHe(int p, int bef, int aft) {

        return p - aft <= bef ? p - bef : aft;
    }
}