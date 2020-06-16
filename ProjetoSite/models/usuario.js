'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Usuario = sequelize.define('Usuario',{
		IdUsuario: {
			field: 'IdUsuario',
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: true
		},		
		Nome: {
			field: 'Nome',
			type: DataTypes.STRING,
			allowNull: false
		},
		Cpf:{
			field: 'Cpf',
			type:DataTypes.INTEGER,
			allowNull:false
		},
		LoginUsuario: {
			field: 'Email',
			type: DataTypes.STRING,
			allowNull: false
		},
		Senha: {
			field: 'Senha',
			type: DataTypes.STRING,
			allowNull: false
		},
		
		NivelAcesso:{
			field: 'NivelAcesso',
			type:DataTypes.INTEGER,
			allowNull:false
		},

		Token: {
			field: 'Token',
			type:DataTypes.STRING,
			allowNull: true
		},

		FkEmpresa:{
			field: 'FkEmpresa',
			type:DataTypes.INTEGER,
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
