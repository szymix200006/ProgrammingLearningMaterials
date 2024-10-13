package org.example;

public class GodNeuron {
    double[] wages = {0.5, -0.5, 0.5};
    public GodNeuron(int inputCount) {
    }

    public double calculatePredict(double ...input) {
        double mulResult = matrixMul(input);
        //todo sigmoid function
        return mulResult;
    }

    public double matrixMul(double[] input) {
        double result = 0;
        for (int i = 0; i < input.length; i++) {
            result += input[i] * wages[i];
        }
        return result;
    }
}
