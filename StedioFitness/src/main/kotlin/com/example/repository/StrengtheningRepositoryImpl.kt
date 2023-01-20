package com.example.repository

import com.example.model.ApiResponse
import com.example.model.Cardio
import com.example.model.StrengthClasses
import com.example.model.Strengthening

class StrengtheningRepositoryImpl: StrengtheningRepository {
    override val allStrengthening: List<Strengthening>
        get() = listOf(
            Strengthening(
                id = 1,
                exerciseName = "Chest",
                image = "/image/bench.png",
                classes = listOf(
                    StrengthClasses(
                        id = 1,
                        className = "Bench Press",
                        rep = "4x12"
                    ),
                    StrengthClasses(
                        id = 2,
                        className = "Machine Flies",
                        rep = "4x12"
                    ),
                    StrengthClasses(
                        id = 3,
                        className = "Incline Dumbbell Press",
                        rep = "3x12"
                    ),
                    StrengthClasses(
                        id = 4,
                        className = "Pull Over",
                        rep = "4x12"
                    )
                )
            ),
            Strengthening(
                id = 2,
                exerciseName = "Biceps",
                image = "/image/biceps.png",
                classes = listOf(
                    StrengthClasses(
                        id = 1,
                        className = "Bicep Dumbbell Curl",
                        rep = "3x12"
                    ),
                    StrengthClasses(
                        id = 2,
                        className = "Hammer Curls",
                        rep = "4x12"
                    ),
                    StrengthClasses(
                        id = 3,
                        className = "Machine cable curls",
                        rep = "4x12"
                    ),
                    StrengthClasses(
                        id = 4,
                        className = "Preacher Curls",
                        rep = "4x12"
                    )
                )
            ),
            Strengthening(
                id = 3,
                exerciseName = "Legs",
                image = "/image/leg.png",
                classes = listOf(
                    StrengthClasses(
                        id = 1,
                        className = "Barbell Squats",
                        rep = "4x12"
                    ),
                    StrengthClasses(
                        id = 2,
                        className = "Leg Extension",
                        rep = "4x12"
                    ),
                    StrengthClasses(
                        id = 3,
                        className = "Leg Press",
                        rep = "3x12"
                    ),
                    StrengthClasses(
                        id = 4,
                        className = "Calf Raise",
                        rep = "3x12"
                    )
                )
            ),
            Strengthening(
                id = 4,
                exerciseName = "Lat (Back)",
                image = "/image/lats.png",
                classes = listOf(
                    StrengthClasses(
                        id = 1,
                        className = "Barbell Curl (Front)",
                        rep = "4x12"
                    ),
                    StrengthClasses(
                        id = 2,
                        className = "Machine pull down",
                        rep = "4x12"
                    ),
                    StrengthClasses(
                        id = 3,
                        className = "T-bar",
                        rep = "4x12"
                    ),
                    StrengthClasses(
                        id = 4,
                        className = "One arm dumbbell",
                        rep = "4x12"
                    )
                )
            ),
            Strengthening(
                id = 5,
                exerciseName = "Shoulder",
                image = "/image/shoulder.png",
                classes = listOf(
                    StrengthClasses(
                        id = 1,
                        className = "Dumbbell Press",
                        rep = "4x12"
                    ),
                    StrengthClasses(
                        id = 2,
                        className = "Lateral Raises",
                        rep = "6x12"
                    ),
                    StrengthClasses(
                        id = 3,
                        className = "Front Raise",
                        rep = "4x12"
                    ),
                    StrengthClasses(
                        id = 4,
                        className = "Shrugs",
                        rep = "4x12"
                    )
                )
            )
        )

    override val getSelectedStrengthClass: Map<Int, List<StrengthClasses>> by lazy {
        mapOf(
            1 to allStrengthening[0].classes,
            2 to allStrengthening[1].classes,
            3 to allStrengthening[2].classes,
            4 to allStrengthening[3].classes,
            5 to allStrengthening[4].classes
        )
    }

    override suspend fun getSelectedStrengthClasses(classId: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            strengthClasses = getSelectedStrengthClass[classId]
        )
    }

    override suspend fun getAllStrengthening(): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            strengthening = allStrengthening
        )
    }

}