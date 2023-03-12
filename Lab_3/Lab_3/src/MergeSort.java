public class MergeSort {
    private double[] buff;

    public MergeSort(double[] buff)
    {
        this.buff = buff;
    }

    public double[] MergeSorting()
    {
        if (buff.length > 1)
        {
            double[] left = new double[buff.length / 2];
            double[] right = new double[buff.length - left.length];

            for (int i = 0; i < left.length; i++)
                left[i] = buff[i];

            for (int i = 0; i < right.length; i++)
                right[i] = buff[left.length + i];

            if (left.length > 1)
                left = MergeSorting(left);
            if (right.length > 1)
                right = MergeSorting(right);

            buff = MergeSorting(left, right);
        }
        return buff;
    }

    private double[] MergeSorting(double[] buff)
    {
        if (buff.length > 1)
        {
            double[] left = new double[buff.length / 2];
            double[] right = new double[buff.length - left.length];

            for (int i = 0; i < left.length; i++)
                left[i] = buff[i];

            for (int i = 0; i < right.length; i++)
                right[i] = buff[left.length + i];

            if (left.length > 1)
                left = MergeSorting(left);
            if (right.length > 1)
                right = MergeSorting(right);

            buff = MergeSorting(left, right);
        }
        return buff;
    }

    private double[] MergeSorting(double[] left, double[] right)
    {
        double[] buff = new double[left.length + right.length];

        int i = 0;
        int l = 0;
        int r = 0;

        for (; i < buff.length; i++)
        {
            if (r >= right.length)
            {
                buff[i] = left[l];
                l++;
            }
            else
            {
                if (l < left.length && left[l] < right[r])
                {
                    buff[i] = left[l];
                    l++;
                }

                else
                {
                    buff[i] = right[r];
                    r++;
                }
            }
        }
        return buff;
    }

    public void ShowArr()
    {
        for (int i = 0; i < buff.length; i++)
            System.out.println(buff[i] + " ");
        System.out.println();
    }

    public double[] ReturnArr(){
        return buff;
    }
}

