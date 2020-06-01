'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Usuario = sequelize.define('Usuario',{
		idUsuario: {
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: true
		},		
		nome: {
			type: DataTypes.STRING,
			allowNull: false
		},
		loginUsuario: {
			type: DataTypes.STRING,
			allowNull: false
		},
		senhaUsuario: {
			type: DataTypes.STRING,
			allowNull: false
		},
		
		nivelAcesso:{
			type:DataTypes.INTEGER,
			allowNull:false
		},
		fkEmpresa:{
			type:DataTypes.INTEGER,
			allowNull:false
		},
		cpf:{
			type:DataTypes.STRING,
			allowNull:false
		}
	}, 
	{
		tableName: 'Usuario', 
		freezeTableName: true, 
		underscored: true,
		timestamps: false,
	});

    return Usuario;
};
