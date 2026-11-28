class Solution {
    void rearrange(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        int i = 0, j = 0, k = 0;
        int pSize = pos.size();
        int nSize = neg.size();

        while (i < pSize && j < nSize) {
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
        }

        while (i < pSize) {
            arr[k++] = pos.get(i++);
        }

        while (j < nSize) {
            arr[k++] = neg.get(j++);
        }
    }
}