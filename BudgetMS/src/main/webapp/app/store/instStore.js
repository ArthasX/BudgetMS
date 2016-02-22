Ext.define('BudgetMS.store.instStore', {
	extend : 'Ext.data.Store',
	//fields : [ 'instId', 'instTitle' ],
	model:'BudgetMS.model.inst',
	data : [ {
		instId : 'Ed',
		instTitle : 'ed@sencha.com'
	}, {
		instId : 'Tommy',
		instTitle : 'tommy@sencha.com'
	} ]
	
});

//fields:'',
// proxy: {
// type: 'ajax',
// url: '/users.json',
// reader: {
// type: 'json',
// root: 'users'
// }
// },
//autoLoad : true