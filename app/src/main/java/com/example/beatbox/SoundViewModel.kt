package com.example.beatbox

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData

class SoundViewModel : BaseObservable() {
//val title: MutableLiveData<String> = MutableLiveData()    можно не через привязку данных, а LiveDate

    var sound: Sound? = null
        set(sound) {
            field = sound
            notifyChange()      //title.postValue(sound?.name)

        }

    @get: Bindable
    val title: String?
        get() = sound?.name
}