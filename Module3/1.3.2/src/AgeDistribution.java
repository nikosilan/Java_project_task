
public class AgeDistribution {

    public static void main(String[] args) {

        final int REITERATIONS = 1000;
        final int MAXAGE = 35;

        // Age distribution: percentage limit and age
        int[][] ageDistribution = {
                {16, 20},
                {34, 21},
                {52, 22},
                {68, 23},
                {82, 24},
                {89, 25},
                {94, 26},
                {96, 28},
                {98, 30},
                {100, 35}
        };

        // Array for counting generated ages
        int[] generatedAges = new int[MAXAGE + 1];

        // Generate 1000 random ages
        for (int i = 0; i < REITERATIONS; i++) {

            int randomNumber = (int)(Math.random() * 100) + 1;

            int j = 0;

            while (randomNumber > ageDistribution[j][0]) {
                j++;
            }

            int age = ageDistribution[j][1];

            generatedAges[age]++;
        }

        // Print results
        System.out.println("Age   Count   Percentage");

        for (int age = 0; age <= MAXAGE; age++) {

            if (generatedAges[age] > 0) {

                double percentage =
                        (double) generatedAges[age] / REITERATIONS * 100;

                System.out.printf("%-6d %-7d %.2f%% %n",
                        age, generatedAges[age], percentage);
            }
        }
    }
}
