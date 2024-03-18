package com.cidadelimpa.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignUpViewModel: ViewModel() {
    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    fun onNameChange(newName: String)
    {
        _name.value = newName.replace(
            regex = Regex(pattern = "[^A-Za-zÁÀÃÂÄÉÈÊËÍÌÎÏÒÓÔÕÖÚÙÛÜÇáàãâäéèêëíìîïóòôõöúùûü ]"),
            replacement = ""
        )
    }

    private val _cpf = MutableLiveData<String>()
    val cpf: LiveData<String> = _cpf

    fun onCpfChange(newCpf: String)
    {
        val maxLength = 11

        if (newCpf.length <= maxLength)
        {
            _cpf.value = newCpf.replace(
                regex = Regex(pattern = "[^0-9]"),
                replacement = ""
            )
        }
    }

    private val _birthDate = MutableLiveData<String>()
    val birthDate: LiveData<String> = _birthDate

    fun onBirthDateChange(newBirthDate: String)
    {
        val maxLength = 8

        if (newBirthDate.length <= maxLength)
        {
            _birthDate.value = newBirthDate.replace(
                regex = Regex(pattern = "[^0-9]"),
                replacement = ""
            )
        }
    }

    private val _cep = MutableLiveData<String>()
    val cep: LiveData<String> = _cep

    fun onCepChange(newCep: String)
    {
        val maxLength = 8

        if (newCep.length <= maxLength)
        {
            _cep.value = newCep.replace(
                regex = Regex(pattern = "[^0-9]"),
                replacement = ""
            )
        }
    }

    private val _pwd = MutableLiveData<String>()
    val pwd: LiveData<String> = _pwd

    fun onPwdChange(newPwd: String)
    {
        val maxLength = 8

        if (newPwd.length <= maxLength)
        {
            _pwd.value = newPwd.replace(
                regex = Regex(pattern = "[^0-9]"),
                replacement = ""
            )
        }
    }
}