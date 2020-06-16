'use strict';

module.exports = (sequelize ,DataType) => {
    let Endereco = sequelize.define('Endereco',{
        
        IdEndereco:{
            field:'IdEndereco',
            type: DataType.INTEGER,
            primaryKey: true,
            autoIncrement: true  
        },

        Cep:{
            field:'Cep',
            type: DataType.STRING,
            allowNull:false
        },

        Rua:{
            field:'Rua',
            type: DataType.STRING,
            allowNull:false
        },

        Numero:{
            field:'Numero',
            type: DataType.INTEGER,
            allowNull:false
        },

        Bairro:{
            field:'Bairro',
            type: DataType.INTEGER,
            allowNull:false
        },

        Cidade:{
            field:'Cidade',
            type:DataType.STRING,
            allowNull:false
        },

        Estado:{
            field:'Estado',
            type:DataType.STRING,
            allowNull: false
        },

        Complemento:{
            field:'Complemento',
            type: DataType.STRING,
            allowNull: true
        }     

    },{
        tableName:"Endereco",
        freezeTableName: true,
        underscored:true,
        timestamps:false,
    });

    return Endereco;
}