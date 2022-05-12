package id.sch.smktelkommlg.fragmentattempt2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val nName = MutableLiveData<String>()
    val name: LiveData<String>
        get() = nName
    fun setName(name: String){
        nName.value = name
    }
}