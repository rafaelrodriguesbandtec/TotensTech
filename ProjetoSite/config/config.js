module.exports = {
  development: {
    dialect: "sqlite",
    storage: "./db.development.sqlite"
  },
  test: {
    dialect: "sqlite",
    storage: ":memory:"
  },
  production: {
    username: 'localadmin',
    password: '#Gfgrupo5b',
    database: 'bdTotensTech',
    host: 'svrtotenstech.database.windows.net',
    dialect: 'mssql',
    xuse_env_variable: 'DATABASE_URL',
    dialectOptions: {
      options: {
        encrypt: true
      }
    },
    pool: { 
      max: 5,
      min: 1,
      acquire: 5000,
      idle: 30000,
      connectTimeout: 5000
    }
  }
};
 

// module.exports = {
//   development: {
//     dialect: "sqlite",
//     storage: "./db.development.sqlite"
//   },
//   test: {
//     dialect: "sqlite",
//     storage: ":memory:"
//   },
//   production: {
//     username: 'root',
//     password: 'bandtec',
//     database: 'TotensTech',
//     host: '0.0.0.0',
//     dialect: 'mysql',
//     xuse_env_variable: 'DATABASE_URL',
//     dialectOptions: {
//       options: {
//         encrypt: true
//       }
//     },
//     pool: { 
//       max: 5,
//       min: 1,
//       acquire: 5000,
//       idle: 30000,
//       connectTimeout: 5000
//     }
//   }
// };

 
