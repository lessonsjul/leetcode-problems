class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        var sarr = s.toCharArray();
        var tarr = t.toCharArray();

        int p1 = sarr.length - 1;
        int p2 = tarr.length - 1;

        while (p1 >= 0 || p2 >= 0) {
            int countHash = 0;
            while (p1 >= 0 && (sarr[p1] == '#' || countHash > 0)) {
                if (sarr[p1] == '#') {
                    countHash++;
                    p1--;
                } else {
                    countHash--;
                    p1--;
                }
            }

            countHash = 0;
            while (p2 >= 0 && (tarr[p2] == '#' || countHash > 0)) {
                if (tarr[p2] == '#') {
                    countHash++;
                    p2--;
                } else {
                    countHash--;
                    p2--;
                }
            }

            if (p1 >= 0 && p2 >= 0 && sarr[p1] != tarr[p2]) {
                return false;
            }

            if ((p1 >= 0) != (p2 >= 0)) {
                return false;
            }

            p1--;
            p2--;

        }

        return true;
    }

}