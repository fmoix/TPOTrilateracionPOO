package com.example.tpotrilateracion.service;

import com.example.tpotrilateracion.entities.ExoPlaneta;
import com.lemmingapex.trilateration.NonLinearLeastSquaresSolver;
import com.lemmingapex.trilateration.TrilaterationFunction;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresOptimizer;
import org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class SateliteService {
    public ExoPlaneta locateExoplanet(double[] distances, double[][] locations) {
        double[] exoplanetLocation = trilateration(distances, locations);

        ExoPlaneta exoplanet = new ExoPlaneta();
        exoplanet.setX(exoplanetLocation[0]);
        exoplanet.setY(exoplanetLocation[1]);

        Random random = new Random();

        String randomName = UUID.randomUUID().toString();
        double randomMass = 1 + (1000 - 1) * random.nextDouble(); // random mass between 1 and 1000
        double randomRadius = 1 + (100 - 1) * random.nextDouble(); // random radius between 1 and 100


        exoplanet.setName(randomName);
        exoplanet.setMass(randomMass);
        exoplanet.setRadius(randomRadius);

        return exoplanet;
    }

    private double[] trilateration(double[] distances, double[][] positions) {
        NonLinearLeastSquaresSolver solver = new NonLinearLeastSquaresSolver(new TrilaterationFunction(positions, distances), new LevenbergMarquardtOptimizer());
        LeastSquaresOptimizer.Optimum optimum = solver.solve();
        return optimum.getPoint().toArray();
    }

    public ExoPlaneta findById(Long id) {

        return new ExoPlaneta();
    }

    public ExoPlaneta save(ExoPlaneta exoplanet) {

        return exoplanet;
    }
}
