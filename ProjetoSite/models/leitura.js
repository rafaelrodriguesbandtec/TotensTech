'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Leitura = sequelize.define('Leitura',{	
		idLeitura: {
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: true
		},	
		leituraMemoria: {
			type: DataTypes.REAL,
			allowNull: false
		},
		leituraDisco: {
			type: DataTypes.REAL,
			allowNull: false
		},
		leituraCpu:{
			type:DataTypes.REAL,
			allowNull:false
		},
		dataHora: {
			type: DataTypes.DATE,
			allowNull: false
		},
		fkTotem:{
			type:DataTypes.INTEGER,
			allowNull:false
		},
		usoDaMemoria:{
			type:DataTypes.REAL,
			allowNull:false

		},
		usoDoDisco:{
			type:DataTypes.REAL,
			allowNull:false
		},
		temperaturaDaCpu:{
			type:DataTypes.REAL,
			allowNull:false

		},
		momento_grafico: {
			type: DataTypes.VIRTUAL, // campo 'falso' (não existe na tabela). Deverá ser preenchido 'manualmente' no select
			allowNull: true
		}
	}, 
	{
		tableName: 'Leitura', 
		freezeTableName: true, 
		underscored: true,
		timestamps: false,
	});

    return Leitura;
};
