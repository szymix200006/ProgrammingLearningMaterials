package org.example;

public class NeuronTypeOne {
    double learningRate = 0.1;
    GodNeuron godNeuron = new GodNeuron(3);
    double wages[];
    public NeuronTypeOne(int inputCount) {
        wages = new double[inputCount];
        for (int i = 0; i < inputCount; i++) {
            wages[i] = Math.random();
        }
    }

    public double calculatePredict(double ...input) {
        double mulResult = matrixMul(input);
        return mulResult;
    }

    public double matrixMul(double[] input) {
        double result = 0;
        for (int i = 0; i < input.length; i++) {
            result += input[i] * wages[i];
        }
        return result;
    }

    public void train() {
        for (int beer = 0; beer < 2; beer++) {
            for (int rain = 0; rain < 2; rain++) {
                for (int friend = 0; friend < 2; friend++) {
                    double perfectAnswer = godNeuron.calculatePredict(beer, rain, friend) >= 0.5 ? 1.0 : 0.0;
                    double stupidAnswer = calculatePredict(beer, rain, friend);
                    double error = perfectAnswer - stupidAnswer;
                        wages[0] -= beer * error * learningRate;
                        wages[1] -= rain * error * learningRate;
                        wages[2] -= friend * error * learningRate;
                }
            }
        }
    }
}
