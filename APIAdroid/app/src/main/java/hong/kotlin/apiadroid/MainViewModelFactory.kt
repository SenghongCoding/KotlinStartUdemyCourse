package hong.kotlin.apiadroid

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import hong.kotlin.apiadroid.repository.Repository

class MainViewModelFactory(
    private val repository: Repository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}