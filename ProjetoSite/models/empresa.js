'use strict';

module.exports = (sequelize, DataTypes) => {
    let Empresa = sequelize.define('Empresa',{
       
        IdEmpresa: {
            field: 'IdEmpresa',
            type: DataTypes.INTEGER,
            primaryKey: true,
            autoIncrement: true
        },
        RazaoSocial:{
            field: 'RazaoSocial',
            type: DataTypes.STRING,
            allowNull: false
        },
        Cnpj:{
            field: 'Cnpj',
            type: DataTypes.STRING,
            allowNull: false
        },

        Email:{
            field: 'Email',
            type: DataTypes.STRING,
            allowNull: false
        },

        SenhaEmpresa: {
            field: 'Senha',
            type: DataTypes.STRING,
            allowNull: false
        },

        FkEndereco:{
            field: 'FkEndereco',
            type: DataTypes.INTEGER,
            allowNull: false
        }
    },
    {
        tableName:'Empresa',
        freezeTableName: true, 
        underscored: true,
        timestamps: false,
    });

    return Empresa;

}