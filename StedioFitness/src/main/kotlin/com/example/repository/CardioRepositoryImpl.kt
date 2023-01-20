package com.example.repository

import com.example.model.ApiResponse
import com.example.model.Cardio

class CardioRepositoryImpl: CardioRepository {
    override val cardio: List<Cardio>
        get() = listOf(
            Cardio(
                id = 1,
                exerciseName = "Speeded  Cycling",
                time = "25 minutes - 1hr",
                image = "/image/cycling.png",
                benefits = "Besides being a recreational activity, cycling is an excellent cardio workout that helps one shed weight and lose belly fat."
            ),
            Cardio(
                id = 2,
                exerciseName = "Lunges",
                time = "5 - 10mins",
                image = "/image/lunges.png",
                benefits = "Lunges increase muscle mass to build up strength and tone your body, especially your core, butt, and legs. Improving your appearance isn't the main benefit of shaping up your body"
            ),
            Cardio(
                id = 3,
                exerciseName = "Meditation",
                time = "30mins",
                image = "/image/meditation.png",
                benefits = "Why exercise and meditation is important Exercise and meditation both boost oxygen and blood flow to the brain which promotes neurogenesis, the process by which new brain cells form. Each positively influences the brain by strengthening focus and concentration, while reducing anxiety and depression."
            ),
            Cardio(
                id = 4,
                exerciseName = "Skipping",
                time = "15mins",
                image = "/image/skipping.png",
                benefits = "What happens if we do skipping daily? It will not only improve your cardio and muscle strength but also help burn calories to support weight loss. Since all you need is a pair of training shoes and a jump rope, many people are ditching their usual cardio workouts for this fun exercise."
            ),
            Cardio(
                id = 5,
                exerciseName = "Tredmill",
                time = "25mins",
                image = "/image/tredmill.png",
                benefits = "Treadmills are easier on your joints, and they are the preferred running alternative for people with severe overweight conditions. Not only does using a treadmill burn belly fat, but one of the long-term effects of regular treadmill sessions is that visceral fat will go away for good"
            ),
            Cardio(
                id = 6,
                exerciseName = "Ultimate Fore arm (Flat)",
                time = "2 mins",
                image = "/image/ultimateforearm.png",
                benefits = "The simplest way to stress your forearms and improve your grip strength is lifting heavy. Deadlifts, chin-ups, and shrugs should be your go-to, according to fitness advisor Scott Mendelson"
            ),
            Cardio(
                id = 7,
                exerciseName = "Circuit",
                time = "2 mins",
                image = "/image/circuit_class.png",
                benefits = "The simplest way to stress your forearms and improve your grip strength is lifting heavy. Deadlifts, chin-ups, and shrugs should be your go-to, according to fitness advisor Scott Mendelson"
            )
        )

    override suspend fun getAllCardio(): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            cardio = cardio
        )
    }

}