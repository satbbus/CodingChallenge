public class LuckyNumber {

    public static void main(String[] args) {

        long[] numbers = new long[]{5512028251L,5514499661L,5512846958L,5513401143L,5513401143L,
                5513402801L,5514974256L,2015806228L,2017195287L,2016773628L,
                2018826770L,2018295894L,5513400325L,5513402801L,5513406664L,
                5513404340L,2015492092L,2015913756L,2016135226L,2015155214L,
                2016367985L,5512132796L,5512443944L,5512846958L,5512401143L,
                5514974256L,5512760350L,5513038256L,2015913756L,2016135226L,
                2015155214L,2015976589L,2016367985L};

        int num = 0;
        int lucky = 0;
        int i=0;
        for(long number:numbers) {
            //System.out.print(number+"-");
            while (i < 10) {
                lucky += number % 10;
                number = number / 10;
                i++;
            }
            i = 0;
            number = lucky;
            while (i < 2) {
                lucky += number % 10;
                number = number / 10;
                i++;
            }
            if(lucky ==7)
            System.out.println(lucky);

        }
    }
}
