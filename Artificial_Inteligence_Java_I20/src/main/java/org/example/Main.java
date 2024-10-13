package org.example;

public class Main {
    public static void main(String[] args) {
        for (int j = 0; j < 10; j++)
        {
            NeuronTypeOne stupidNeuron = new NeuronTypeOne(3);
            //testNeuron(stupidNeuron);
            for (int i = 0; i < 1000; i++) {
                stupidNeuron.train();
                double success = getSuccessPercent(stupidNeuron);
                if (success == 100.0) {
                    System.out.println(i);
                    break;
                }
            }
        }


    }
    public static double getSuccessPercent(NeuronTypeOne neuronTypeOne) {
        GodNeuron godNeuron = new GodNeuron(3);
        int correctAnswerCounter = 0;
        for (int beer = 0; beer < 2; beer++) {
            for (int rain = 0; rain < 2; rain++) {
                for (int friend = 0; friend < 2; friend++) {
                    double stupidAnswer = neuronTypeOne.calculatePredict(beer, rain, friend) >= 0.5 ? 1.0 : 0.0;
                    double godAnswer = godNeuron.calculatePredict(beer, rain, friend) >= 0.5 ? 1.0 : 0.0;
                    if(stupidAnswer == godAnswer) {
                        correctAnswerCounter++;
                    }
                }
            }
        }
        return (correctAnswerCounter / 8.0) * 100.0;
    }

        public static void testNeuron(NeuronTypeOne neuron) {
            for (int beer = 0; beer < 2; beer++) {
                for (int rain = 0; rain < 2; rain++) {
                    for (int friend = 0; friend < 2; friend++) {
                        double neuronAnswer = neuron.calculatePredict(beer, rain, friend);
                        String answer = neuronAnswer >= 0.5 ? "Yes" : "No";
                        System.out.println(answer);
                    }
                }
            }
        }

}