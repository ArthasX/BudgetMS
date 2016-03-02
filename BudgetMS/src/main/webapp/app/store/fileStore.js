Ext.define('BudgetMS.store.fileStore', {
	name : 'file',
	extend : 'Ext.data.Store',
	model : 'BudgetMS.model.file',
	proxy : {
		type : 'ajax',
		url : 'attach/getAttachByIdType.do',
		reader : {
			type : 'json',
		// root : 'record',
		// totalProperty : 'total'
		}
	},
	// data : [ {
	// attachId : '1',
	// attachName : 'QSBH001',
	// recordId : 'QSBH001',
	// url : '#',
	// attach_type : '',
	// remark : ''
	// } ]
	listeners : {
//		'beforeload' : function(store, operation, eOpts) {
//			debugger;
//			var grid = store.ownerCt;
//			var recordId = gird.up('window').down('form').getForm().findField(
//					gird.name + 'Id').getValue();
//			 
//			var obj = {
//				recordId : recordId,
//				attachType : gird.name
//			};
//			var params = {
//				obj : Ext.JSON.encode(obj)
//			};
//			console.log(recordId, store, obj, params);
//			Ext.apply(store.proxy.extraParams, params);
//			 
//		}
	}
});

// fields:'',
