public class InsuranceStrategyLow extends InsuranceStrategy {
    @Override
    public int getConstant() {
        return 3560;
    }

    @Override
    public double getWeight() {
        return 1;
    }

    @Override
    public int getAdjustment() {
        return 1000;
    }
}
