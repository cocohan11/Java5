package 연습;


public class 출근 {
    public static void main(String[] args) {
        학생 학생제임스 = new 학생("제임스", 5000);
        학생 학생토마스 = new 학생("토마스", 10000);

        버스 bus100 = new 버스(100);
        학생제임스.takeBus(bus100);
        학생제임스.showInfo();
        bus100.showInfo();

        지하철 초록라인 = new 지하철("2호선");
        학생토마스.takeSubway(초록라인);
        학생토마스.showInfo();
        초록라인.showInfo();

    }
}
