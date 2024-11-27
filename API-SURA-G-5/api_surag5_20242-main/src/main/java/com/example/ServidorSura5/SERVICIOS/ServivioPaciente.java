package com.example.ServidorSura5.SERVICIOS;

import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ServivioPaciente {

    @Autowired
    IRepositorioPaciente iRepositorioPaciente;

    public Paciente guardarPaciente(Paciente datosPaciente)throws Exception{
        try{
            return iRepositorioPaciente.save(datosPaciente);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<Paciente> buscarPaciente()throws Exception{
        try{
            return iRepositorioPaciente.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
