package com.example.singletonexample

class DataSingleton {
    companion object {
        private var instance: DataSingleton? = null

        fun getInstance(): DataSingleton? {
            if (instance == null) instance = DataSingleton()

            return instance
        }

    }
    //variable
    var message: String? = null
}