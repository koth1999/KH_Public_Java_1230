package 자동차종합예제;

public abstract class Car {
    int maxSpeed; // 최고속도
    int fuelEff; // 연비
    int fuelTank; // 연료탱크
    int seatCnt; // 좌석
    String name; // 자동차 이름

    abstract void setMode(boolean isMode);

    // 이동 횟수 구하기 : 입력값으로 승객의 수가 필요
    int getMovingCnt(int passCnt){
        if(passCnt % seatCnt!=0) return (passCnt/seatCnt)+1;
        return passCnt/seatCnt;
    }

    // 총 이동 비용
    int getTotalCost(int dist, int moveCnt){
        return (dist/fuelEff * 2000)*moveCnt;
    }

    // 총 주유 횟수
    int getRefuelCnt(int dist, int moveCnt) {
        if (((dist * moveCnt) / fuelEff) % fuelTank != 0)
            return (((dist * moveCnt) / fuelEff) / fuelTank) + 1;
        else return ((dist * moveCnt) / fuelEff) / fuelTank;
    }

    // 총 소요 시간
    double getMovingTime(int dist, int moveCnt){
        return (double) dist * moveCnt / maxSpeed;
    }
}

