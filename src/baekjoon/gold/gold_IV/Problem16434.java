package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem16434 {
    private static int n;
    private static int initAttackPoint;
    private static long result = Long.MAX_VALUE - 1;
    private static final List<MapInformation> mapInformationList = new ArrayList<>();
    private static final long MIN_HEALTH_POINT = 1;
    private static final long MAX_HEALTH_POINT = Long.MAX_VALUE - 1;

    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            init(br);

            findMinHealthPoint(MIN_HEALTH_POINT, MAX_HEALTH_POINT);

            bw.write(result + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void init(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        initAttackPoint = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            MapInformation mapInformation = new MapInformation(
                     Integer.parseInt(st.nextToken()),
                     Integer.parseInt(st.nextToken()),
                     Integer.parseInt(st.nextToken()));

            mapInformationList.add(mapInformation);
        }
    }

    private static void findMinHealthPoint(long start, long end) {
        while (start <= end) {
            long mid = (start + end) / 2;

            Hero hero = new Hero(initAttackPoint, mid, mid);

            boolean flag = simulation(hero);

            if (flag) {
                end = mid - 1;
                result = mid;

            } else {
                start = mid + 1;
            }
        }
    }
    private static boolean simulation(Hero hero) {
        for (int i = 0; i < n; i++) {
            MapInformation mapInformation = mapInformationList.get(i);

            long mapHealthPoint = mapInformation.healthPoint;
            long mapAttackPoint = mapInformation.attackPoint;

            if (mapInformation.type == 1) {
                long requiredAttackCount = mapHealthPoint / hero.attackPoint;

                if (mapHealthPoint % hero.attackPoint == 0) {
                    requiredAttackCount--;
                }

                long damagedHero = requiredAttackCount * mapAttackPoint;

                hero.currentHealthPoint -= damagedHero;

                if (hero.currentHealthPoint <= 0) {
                    return false;
                }
            }

            else if (mapInformation.type == 2) {
                long checkHealthPoint = hero.currentHealthPoint + mapHealthPoint;

                if (hero.maxHealthPoint < checkHealthPoint) {
                    hero.currentHealthPoint = hero.maxHealthPoint;
                }
                else {
                    hero.currentHealthPoint += mapHealthPoint;
                }

                hero.attackPoint += mapAttackPoint;
            }
        }

        return true;
    }
}

class Hero {
    public long attackPoint;
    public long currentHealthPoint;
    public final long maxHealthPoint;

    public Hero(long attackPoint, long currentHealthPoint, long maxHealthPoint) {
        this.attackPoint = attackPoint;
        this.currentHealthPoint = currentHealthPoint;
        this.maxHealthPoint = maxHealthPoint;
    }
}

class MapInformation {
    public long type;
    public long attackPoint;
    public long healthPoint;

    public MapInformation(long type, long attackPoint, long healthPoint) {
        this.type = type;
        this.attackPoint = attackPoint;
        this.healthPoint = healthPoint;
    }
}